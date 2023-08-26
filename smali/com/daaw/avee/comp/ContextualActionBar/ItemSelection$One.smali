.class public Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;
.super Ljava/lang/Object;
.source "ItemSelection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "One"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

.field private item:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "TT;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-static {p1}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 52
    invoke-static {p2}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 53
    iput-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    .line 54
    iput-object p2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;)Ljava/lang/Object;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public containsItem(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 59
    instance-of v0, p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 60
    :cond_0
    check-cast p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    .line 61
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    iget-object v2, p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-interface {v0, v2}, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    iget-object p1, p1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getContainerIdentifier()Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    return-object v0
.end method

.method public getItemIdentifier()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;->item:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
