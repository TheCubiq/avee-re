.class public Lcom/daaw/jt1$a;
.super Lcom/daaw/jt1$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jt1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jt1$a$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/daaw/jt1$a$a;

.field public static final e:Lcom/daaw/hn$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/hn$b<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/jt1$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/jt1$a$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/jt1$a;->d:Lcom/daaw/jt1$a$a;

    sget-object v0, Lcom/daaw/jt1$a$a$a;->a:Lcom/daaw/jt1$a$a$a;

    sput-object v0, Lcom/daaw/jt1$a;->e:Lcom/daaw/hn$b;

    return-void
.end method
