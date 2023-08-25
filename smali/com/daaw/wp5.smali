.class public final synthetic Lcom/daaw/wp5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/cq5;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cq5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wp5;->a:Lcom/daaw/cq5;

    iput-object p2, p0, Lcom/daaw/wp5;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wp5;->b:Ljava/lang/String;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, v0}, Lcom/daaw/cq5;->L(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
