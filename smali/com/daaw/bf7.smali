.class public Lcom/daaw/bf7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/af7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bf7;->a:Ljava/lang/Class;

    iput-object p2, p0, Lcom/daaw/bf7;->b:Ljava/lang/Class;

    return-void
.end method

.method public static a(Lcom/daaw/ze7;Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/bf7;
    .locals 1

    new-instance v0, Lcom/daaw/ve7;

    invoke-direct {v0, p1, p2, p0}, Lcom/daaw/ve7;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/daaw/ze7;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bf7;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/bf7;->b:Ljava/lang/Class;

    return-object v0
.end method
