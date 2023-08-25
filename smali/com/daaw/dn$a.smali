.class public Lcom/daaw/dn$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/dn;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/EditText;

.field public final synthetic q:Landroid/widget/Spinner;

.field public final synthetic r:[J

.field public final synthetic s:Ljava/util/ArrayList;

.field public final synthetic t:Lcom/daaw/dn;


# direct methods
.method public constructor <init>(Lcom/daaw/dn;Landroid/widget/EditText;Landroid/widget/Spinner;[JLjava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dn$a;->t:Lcom/daaw/dn;

    iput-object p2, p0, Lcom/daaw/dn$a;->p:Landroid/widget/EditText;

    iput-object p3, p0, Lcom/daaw/dn$a;->q:Landroid/widget/Spinner;

    iput-object p4, p0, Lcom/daaw/dn$a;->r:[J

    iput-object p5, p0, Lcom/daaw/dn$a;->s:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object p1, p0, Lcom/daaw/dn$a;->p:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/daaw/dn$a;->q:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    if-ltz p1, :cond_1

    sget-object p2, Lcom/daaw/kx0;->d:[Lcom/daaw/kx0;

    array-length v0, p2

    add-int/lit8 v0, v0, 0x1

    if-ge p1, v0, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Lcom/daaw/dn;->p:Lcom/daaw/sw1;

    iget-object p2, p0, Lcom/daaw/dn$a;->r:[J

    iget-object v0, p0, Lcom/daaw/dn$a;->s:Ljava/util/ArrayList;

    invoke-virtual {p1, v2, p2, v0}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    aget-object v3, p2, p1

    sget-object v0, Lcom/daaw/dn;->q:Lcom/daaw/uw1;

    const/4 v1, 0x0

    iget-object v4, p0, Lcom/daaw/dn$a;->s:Ljava/util/ArrayList;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/uw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
